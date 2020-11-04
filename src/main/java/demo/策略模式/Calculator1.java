package demo.策略模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 5:22 下午
 * @company 红尘互娱创意文化
 */
public enum  Calculator1 {

  /**
   * 算法策略
   */
  ADD("+"){
    @Override
    public int exec(int a,int b){
      return a+b;
    }
  },
  SUB("-"){
    @Override
    public int exec(int a,int b){
      return a-b;
    }
  };



  private final String value;

  public String getValue() {
    return value;
  }

  Calculator1(String value){
    this.value=value;
  }



  /**
   * 业务
   * @param a
   * @param b
   * @return
   */
  public abstract int exec(int a,int b);

}
