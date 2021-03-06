package aop;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;
import java.util.Optional;

/**
 * @Author: yichuan
 * @Date: 2020/6/8 11:52 上午
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) context.getBean("arithmeticCalculator");
//        System.out.println(arithmeticCalculator.getClass());
//        int result = arithmeticCalculator.add(3, 5);
//        System.out.println("result: " + result);
//        result = arithmeticCalculator.div(5, 0);
//        System.out.println("result: " + result);
        WishListOrderExtra wishListOrderExtra = new WishListOrderExtra();
        wishListOrderExtra.setExpiredLiveTime(0);
        String s = JSON.toJSONString(wishListOrderExtra);

    }


    @Data
    public static class WishListOrderExtra  {
        private Long wishListOrderId;
        /**
         * 预计开播时间
         */
        private Integer expiredLiveTime;

        /**
         * 是否是店铺自播
         */
        private Integer isSupplierLive;
    }
}
