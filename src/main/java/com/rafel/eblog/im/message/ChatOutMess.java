package com.rafel.eblog.im.message;

import com.rafel.eblog.im.vo.ImMess;
import lombok.Data;

@Data
public class ChatOutMess {

    private String emit;
    private ImMess data;

}
