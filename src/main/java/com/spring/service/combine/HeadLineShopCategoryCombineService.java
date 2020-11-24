package com.spring.service.combine;

import com.spring.entity.dto.MainPageInfoDTO;
import com.spring.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
