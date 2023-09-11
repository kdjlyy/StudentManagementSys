package cn.kdjlyy.studentmanagementsys.model;

import com.alibaba.fastjson.JSONObject;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
