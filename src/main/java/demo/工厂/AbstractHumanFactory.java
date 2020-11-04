package demo.工厂;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 10:34 下午
 * @company 红尘互娱创意文化
 */
public abstract class AbstractHumanFactory {

   abstract <T extends Human> T createHuman(Class<T> c);

}
