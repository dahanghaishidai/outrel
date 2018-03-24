package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dto.ExtWlZxtQuestionsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtQuestionsDao
 * @description: 定义  核身问答信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtQuestionsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtQuestionsDTO> searchExtWlZxtQuestionsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtQuestionsDTO> searchExtWlZxtQuestions(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param id
     * @return
     */
    public ExtWlZxtQuestionsDTO findExtWlZxtQuestionsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtQuestions(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param paramMap
     */
    public void updateExtWlZxtQuestions(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除核身问答信息表
     * @date 2017-12-13 10:20:17
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtQuestionsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
