public static void hanoi(int n,char from,char in,char to){
  if(n==1){
  syso("第一个盘子从"+from+"移动"+to);
  }else{
  hanoi(n-1,from,to,in);
  syso("第"+n+"个盘子从"+from+"移到"+to);
  hanoi(n-1,in,from,to);
  }

}
