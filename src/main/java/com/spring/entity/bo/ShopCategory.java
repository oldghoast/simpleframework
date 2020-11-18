package com.spring.entity.bo;

import lombok.Data;

import java.util.Date;

@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private ShopCategory parent;
}
