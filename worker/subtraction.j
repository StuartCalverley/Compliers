.class public subtraction
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

ldc 50 
istore 0 
ldc 3 
istore 1 
iload 0 
iload 1 
isub  
istore 2 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2 
invokevirtual java/io/PrintStream/println(I)V 

	return
.end method
