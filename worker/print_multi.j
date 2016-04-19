.class public print_multi
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

ldc 9 
istore 0 
ldc 5 
istore 1 
ldc 4 
istore 2 
ldc 6 
istore 3 
ldc 978 
istore 4 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
invokevirtual java/io/PrintStream/print(I)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " " 
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1 
invokevirtual java/io/PrintStream/print(I)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " " 
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2 
invokevirtual java/io/PrintStream/print(I)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " " 
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3 
invokevirtual java/io/PrintStream/print(I)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " " 
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 4 
invokevirtual java/io/PrintStream/println(I)V 

	return
.end method
