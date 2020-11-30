package demo.pattern.factory.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DellKeyBoard implements KeyBoard {
    @Override
    public void sayHello() {
        log.debug("我是戴尔键盘");
    }
}
