package demo.责任链;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 3:02 下午
 * @company 红尘互娱创意文化
 */
public class Women implements IWomen{

  /**
   * 通过 type 定义women的个人情况
   * 1。未出嫁
   * 2。出嫁
   * 3。夫死
   */
  private int type=0;
  private String request="";

  public Women(int  type,String request){
    this.type=type;
    switch (this.type){
      case 1:
        this.request="女儿的请求是"+request;
        break;
      case 2:
        this.request="妻子的请求是"+request;
        break;
      case 3:
        this.request="母亲的请求是"+request;
        break;
      default:
        break;
    }
  }

  @Override
  public int getType() {
    return this.type;
  }

  @Override
  public String getRequest() {
    return this.request;
  }
}
