.data #data
val1:   .asciiz "Enter 1st interger: "
val2:   .asciiz "Enter 2nd interger: "
str:    .asciiz "The result =  "
.text
.globl main
main:    li $2, 4
         la $4, val1
         syscall
         li $2, 5
         syscall
         move $16, $2
         li $2, 4
         la $4, val2
         syscall
         li $2, 5
         syscall
         add $16, $16 , $2
         li $2, 4
         la $4, str
         syscall
         li $2, 1
         move $4, $16
         syscall
         li $2, 10
         syscall
