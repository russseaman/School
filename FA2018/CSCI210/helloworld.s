.text
.globl main
main:
    li $v0, 4
    la $a0, str
    syscall #print string
    li $v0, 10
    syscall #exit( you must use syscall 10 to exit)
.data
str: .asciiz "Hello world!"
