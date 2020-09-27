package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallDicCode;
import org.jinyuanjava.litemall.db.domain.LitemallDicCodeExample;

public interface LitemallDicCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    long countByExample(LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int insert(LitemallDicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int insertSelective(LitemallDicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallDicCode selectOneByExample(LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallDicCode selectOneByExampleSelective(@Param("example") LitemallDicCodeExample example, @Param("selective") LitemallDicCode.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallDicCode> selectByExampleSelective(@Param("example") LitemallDicCodeExample example, @Param("selective") LitemallDicCode.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    List<LitemallDicCode> selectByExample(LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallDicCode selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallDicCode.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    LitemallDicCode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallDicCode selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallDicCode record, @Param("example") LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallDicCode record, @Param("example") LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallDicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallDicCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallDicCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_dic_code
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}