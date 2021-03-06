package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewLitemallGoodsProduct;
import org.jinyuanjava.litemall.db.domain.ViewLitemallGoodsProductExample;

public interface ViewLitemallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    long countByExample(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int insert(ViewLitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(ViewLitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewLitemallGoodsProduct selectOneByExample(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewLitemallGoodsProduct selectOneByExampleSelective(@Param("example") ViewLitemallGoodsProductExample example, @Param("selective") ViewLitemallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewLitemallGoodsProduct selectOneByExampleWithBLOBs(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewLitemallGoodsProduct> selectByExampleSelective(@Param("example") ViewLitemallGoodsProductExample example, @Param("selective") ViewLitemallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    List<ViewLitemallGoodsProduct> selectByExampleWithBLOBs(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    List<ViewLitemallGoodsProduct> selectByExample(ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewLitemallGoodsProduct record, @Param("example") ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ViewLitemallGoodsProduct record, @Param("example") ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewLitemallGoodsProduct record, @Param("example") ViewLitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_litemall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewLitemallGoodsProductExample example);
}