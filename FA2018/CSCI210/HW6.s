.data           # data
prompt:   .asciiz  "Please enter your name (last, first):   "
yname:    .asciiz  "xxxxxxxxxxxxxxxxxxxxxxxxxxx”
.text	 #   INSTRUCTIONS
.globl main
main:	li  $2, 4		# print prompt
		la  $4,  prompt
		syscall
		li  $2, 8		# read string
		li $5, 20		# length of string = 20
		la $4, yname
		syscall
		li  $2, 4		# print result
		la  $4, yname
		syscall
		li  $2, 10		# exit program
		syscall
