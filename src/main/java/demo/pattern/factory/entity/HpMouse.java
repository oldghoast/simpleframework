package demo.pattern.factory.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        log.debug("我是惠普鼠标");
    }
}
