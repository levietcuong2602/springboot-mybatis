package com.smartosc.datasource.vo;

import com.smartosc.datasource.entity.Block;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BlockVo {
    private Long id;

    private Object blockHash;

    private Object epochNo;

    private Object slotNo;

    private Object epochSlotNo;

    private Object blockNo;

    private Long previousId;

    private Long slotLeaderId;

    private Object size;

    private Date time;

    private Long txCount;

    private Object protoMajor;

    private Object protoMinor;

    private String vrfKey;

    private Object opCert;

    private Object opCertCounter;

    private static final long serialVersionUID = 1L;
}
