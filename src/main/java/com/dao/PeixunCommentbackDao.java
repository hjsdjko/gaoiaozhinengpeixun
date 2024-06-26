package com.dao;

import com.entity.PeixunCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunCommentbackView;

/**
 * 培训评价 Dao 接口
 *
 * @author 
 */
public interface PeixunCommentbackDao extends BaseMapper<PeixunCommentbackEntity> {

   List<PeixunCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
