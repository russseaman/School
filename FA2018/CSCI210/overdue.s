.text
.globl main
main:
	li $v0, 4
	la $a0, prompt
	syscall
	li $v0,8
	la $a0, name
	
	li $a1, 24
	syscall

	li $v0, 4 
	
	la $a0, letter

	li $v0, 4	