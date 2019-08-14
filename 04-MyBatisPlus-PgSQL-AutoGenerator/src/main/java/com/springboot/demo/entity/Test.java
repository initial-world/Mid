package com.springboot.demo.entity;

    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author cx
* @since 2019-08-12
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 姓名
            */
    private String name;

    private Integer age;


}
