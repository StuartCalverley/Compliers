.class public repeat_multi
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit stack 10
	.limit locals 10

ldc 0 
istore 0 
ldc 10 
istore 1 
LABEL0:   
iload 1 
ifeq LABEL1 
iload 1 
ldc 1 
isub  
istore 1 
iload 0 
ldc 1 
iadd  
istore 0 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
invokevirtual java/io/PrintStream/println(I)V 
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
ldc 10 
iadd  
invokevirtual java/io/PrintStream/println(I)V 
goto LABEL0 
LABEL1:   

	return
.end method
