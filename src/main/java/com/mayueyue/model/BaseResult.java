package com.mayueyue.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult<T> {

    private int code ;

    private String msg ;

    private T data ;

    public static BaseResult success(){
        return new BaseResult(0,"success",null);
    }
}
