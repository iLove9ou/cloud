package com.cloud.service;

import com.cloud.service.APPAudit;
import com.cloud.service.APPAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface APPAuditMapper extends Mapper<APPAudit> {
    int countByExample(APPAuditExample example);

    int deleteByExample(APPAuditExample example);

    List<APPAudit> selectByExample(APPAuditExample example);

    int updateByExampleSelective(@Param("record") APPAudit record, @Param("example") APPAuditExample example);

    int updateByExample(@Param("record") APPAudit record, @Param("example") APPAuditExample example);
}