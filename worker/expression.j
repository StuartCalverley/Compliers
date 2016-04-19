.class public expression
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

ldc 3 
istore 0 
ldc 2 
istore 1 
ldc 9 
iload 0 
idiv  
iload 1 
iadd  
istore 2 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2 
invokevirtual java/io/PrintStream/println(I)V 

	return
.end method
