.data
array: .space 100
askInput: .asciiz "Enter integer (0 to exit): \n"
thankyou: .asciiz "Thank you!\n"
output: .asciiz "Thank you \n Sorted array (Descending order): \n"
newline: .asciiz "\n" 

.text

.globl main

main:
    la $a1, array
    li $a2, 9
    li $t0, 0
    li $t1, 0
    la $a3, 0   #starting array size
loop:
    la $a0, askInput
    add $a3, $a3, 1
    li $v0, 4
    syscall
   
    li $v0, 5
    syscall
    
    beq $v0,$t1,sort
    beq $a3, 20, sort
    addi $t0,$t0,4
    sw $v0, ($a1)
    addi $a1, $a1, 4 # move the array over by 1 element
    j loop
    
sort:
    la $t4, array #t0 is number up to outter loop
    la $t1, array #t1 is number comparing to inner loop
    addi $t1,$t1,4
    la $t8,array
    add $t8,$t0,$t8
    la $t9,array
    add $t9,$t0,$t9
    addi $t9,$t9,-4

loops:
    lw $t2,($t4) #get number 1 outter loop
    lw $t3,($t1) #get number 2 inner loop
    blt $t3,$t2,next #don't need to swap
    sw $t3,($t4) #swap
    sw $t2,($t1)

next:
    addi $t1,$t1,4
    blt $t1,$t8,loops #inner loop exit?
    addi $t4,$t4,4 #yes-increment outter loop
    move $t1,$t4
    addi $t1,$t1,4
    blt $t4,$t9,loops #outter loop exit?

printArray:
    la $a1,array
    la $a0, output
    li $v0, 4
    syscall

loop1:
    blez $t0, exit
    li $v0, 1
    lw $a0, 0($a1)
    syscall

    la $a0, newline 
    li $v0, 4
    syscall

    addi $a1, $a1, 4
    addi $t0, $t0, -4
    j loop1

exit:
j exit