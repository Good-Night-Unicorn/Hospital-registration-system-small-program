package com.dao;

import com.entity.KeshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshiVO;
import com.entity.view.KeshiView;


/**
 * 科室
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public interface KeshiDao extends BaseMapper<KeshiEntity> {
	
	List<KeshiVO> selectListVO(@Param("ew") Wrapper<KeshiEntity> wrapper);
	
	KeshiVO selectVO(@Param("ew") Wrapper<KeshiEntity> wrapper);
	
	List<KeshiView> selectListView(@Param("ew") Wrapper<KeshiEntity> wrapper);

	List<KeshiView> selectListView(Pagination page,@Param("ew") Wrapper<KeshiEntity> wrapper);
	
	KeshiView selectView(@Param("ew") Wrapper<KeshiEntity> wrapper);
	
}
