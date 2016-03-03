package test.wn.modules;

import com.weinong.base.*;
import test.wn.bean.Liuqian;
import test.wn.requestbean.DeleteLiuqianForm;
import test.wn.service.LiuqianService;
import yao.util.string.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/3.
 */
@ApiDefined(label = "DeletelqAction", description = "deletelq信息")
public class DeleteLiuqianAction extends BaseApiAction {
    @ParamDefined(label = "请求参数", checkType = CheckType.empty)
    private DeleteLiuqianForm param;

    // >0 成功 0 系统异常 <0 失败
    @Override
    protected void registResult(Map<Integer, String> map) {
        map.put(1, "删除成功");
        map.put(-1, "删除失败");
        map.put(-2, "Id不能为空");
    }

    @Override
    public ApiResult doApi() throws Exception {
        try {
            Liuqian lq = new Liuqian();
            if (StringUtil.isEmpty(String.valueOf(param.getId())))
                return result_fail(-2);
            lq.setId(param.getId());
            int num = LiuqianService.delete(lq);
            Map<String, Object> rs = new HashMap<>();
            rs.put("num", num);
            return result_success(1, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result_fail(-1);
    }

    private Liuqian buildTest(DeleteLiuqianForm param) {
        Liuqian lq = new Liuqian();
        lq.setId(param.getId());
        return lq;
    }

    public DeleteLiuqianForm getParam() {
        return param;
    }

    public void setParam(DeleteLiuqianForm param) {
        this.param = param;
    }
}
