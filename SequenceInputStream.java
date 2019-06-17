FileInputStream fis1 = new FileInputStream("a.txt");
FileInputStream fis2 = new FileInputStream("b.txt");
FileInputStream fis3 = new FileInputStream("c.txt");
Vector<InputStream> v = new Vector<>();
v.add(fis1);
v.add(fis2);
v.add(fis3);
Enumeration<InputStream> en = v.elements();
SequenceInputStream sis = new SequenceInputStream(en);
FileOutPutStream fos = new FileOutputStream("d.txt");
int b;
while((b = sis.read())!= -1){
fos.write(b);
}
sis.close();
fos.close();
