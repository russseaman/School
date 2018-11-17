## Russ Seaman 
## 11/14/2018
## HW6 - Dr. Majumder

.data           
	prompt:   .asciiz  "Please enter your name (last, first):   "
	yname:    .asciiz  "Hello! xxxxxxxxxxxxxxxxxxxxxxxxxxx"
	val1:     .asciiz  "Enter 1st integer:  "
	val2:     .asciiz  "Enter 2nd integer:  "
	str:      .asciiz  "The result = "

.text	 #   INSTRUCTIONS
.globl main	
main:	
	##INPUT FOR NAME
	li  $2, 4		# print prompt
	la  $4,  prompt
	syscall
	li  $2, 8		# read string
	li $5, 40		# length of string = 40
	la $4, yname                 
	syscall
	li  $2, 4		# print result
	la  $4, yname   
	syscall
	
	## INPUT FOR INTEGERS
	li  $2, 4               #  print string
        la  $4, val1
        syscall  
        li  $2, 5               # read 1st in -- result in r2
        syscall
        move $16, $2            # save 1st integer
        li  $2, 4               # print string
        la  $4, val2    
        syscall
        li  $2, 5               #  read 2nd int -- result in r2
        syscall
        add   $16, $16, $2      # sum both integers
        li $2, 4                # print string
        la $4, str
        syscall
        li $2, 1                #  print int
        move $4, $16            
        syscall
        li  $2, 10              # exit program
        syscall	
	
	li  $2, 10		# exit program
	syscall
