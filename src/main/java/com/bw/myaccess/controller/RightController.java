package com.bw.myaccess.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.myaccess.biz.GroupService;
import com.bw.myaccess.biz.OrganService;
import com.bw.myaccess.biz.RoleService;
import com.bw.myaccess.biz.UserService;
import com.bw.myaccess.entity.Group;
import com.bw.myaccess.entity.Role;
import com.bw.myaccess.entity.User;
import com.bw.myaccess.vo.RightVo;

@Controller
public class RightController {
	
	private GroupService groupService;
	private RoleService roleService;
	private UserService userService;
	private OrganService organService;
	@Autowired
	public void setOrganService(OrganService organService) {
		this.organService = organService;
	}
	@Autowired
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}
	@Autowired
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/treeright")
	@ResponseBody
	public List<RightVo> getTreeRight(){
		List<RightVo> rightVos = new ArrayList<RightVo>();
		
		
		RightVo rightVo = new RightVo();
		rightVo.setText("组信息");
		List<RightVo> nodes1 = new ArrayList<RightVo>();
		
		List<Group> groups = groupService.getGroups();
		for (Group group : groups) {
			RightVo temp = new RightVo();
			temp.setText(group.getGroupName());
			nodes1.add(temp);
		}
		rightVo.setNodes(nodes1);
		rightVos.add(rightVo);
		
		//----------------------------------
		
		RightVo rightVo1 = new RightVo();
		rightVo1.setText("角色信息");
		List<RightVo> nodes2 = new ArrayList<RightVo>();
		
		List<Role> roles = roleService.getRoles();
		for (Role role : roles) {
			RightVo temp = new RightVo();
			temp.setText(role.getRoleName());
			nodes2.add(temp);
		}
		
		rightVo1.setNodes(nodes2);
		rightVos.add(rightVo1);
		
		
		
		
		RightVo rightVo2 = new RightVo();
		rightVo2.setText("用户信息");
		List<RightVo> nodes3 = new ArrayList<RightVo>();
		
		for(Long i =0L;i<10;i++) {
			List<User> users = userService.selectByToId(i);
			if(users!=null&&users.size()!=0) {
				RightVo tempOrg = new RightVo();
				List<RightVo> userOrgs = new ArrayList<RightVo>();
				for (User user : users) {
					RightVo temp = new RightVo();
					temp.setText(user.getLoginName());
					userOrgs.add(temp);
				}
				tempOrg.setText(organService.getOrganByToId(i).getOgrName());
				tempOrg.setNodes(userOrgs);
				nodes3.add(tempOrg);
			}
		}
		
		rightVo2.setNodes(nodes3);
		rightVos.add(rightVo2);
		
		return rightVos;
		
	}

	
	
	
	
	
	
	
}
