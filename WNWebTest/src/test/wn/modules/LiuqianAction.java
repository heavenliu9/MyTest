package test.wn.modules;

import com.weinong.base.*;
import test.wn.bean.Liuqian;
import test.wn.requestbean.LiuqianForm;
import test.wn.service.LiuqianService;
import yao.util.date.DateUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/2.
 */
@ApiDefined(label = "lqAction",description = "lq信息")
public class LiuqianAction extends BaseApiAction {

    // >0 成功 0 系统异常 <0 失败
    @Override
    protected void registResult(Map<Integer, String> map) {
        map.put(1,"查询成功");
        map.put(-1,"查询失败");
    }

    @Override
    public ApiResult doApi() throws Exception {
        try {
            List<Liuqian> lqList = LiuqianService.getAll();
            Map<String, Object> rs = new HashMap<>();
            rs.put("allLiuqian", lqList);
            return result_success(1, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result_fail(-1);
    }

}
