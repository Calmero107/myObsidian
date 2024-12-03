In the shift operation, the data being operated is regarded as a binary number, and the shift is the operation of moving it to the left or right by a certain number of bits.

- `<<`: Left shift operator, shifts a certain number of bits to the left, discards the high bits, and fills the low bits with zeros. `x << n`, equivalent to ==x multiplied by 2 to the power of n== (without overflow).
- `>>`: Shift right with sign, shift right by a certain number of bits, fill the high bit with sign bit, and discard the low bit. Fill the high bit with 0 for positive numbers and 1 for negative numbers. `x >> n`, equivalent to ==x divided by 2 to the power of n==.
- `>>>`: Unsigned right shift, ignoring the sign bit and filling empty bits with 0.


**What happens if the number of bits shifted exceeds the number of bits occupied by the value?**

When the number of bits of the int type left/right shift is greater than or equal to 32 bits, the remainder (%) will be calculated before the left/right shift operation. In other words, a left/right shift of 32 bits is equivalent to no shift operation (32%32=0), and a left/right shift of 42 bits is equivalent to a left/right shift of 10 bits (42%32=10). When the long type is shifted left/right, since the binary corresponding to long is 64 bits, the base of the remainder operation also becomes 64.

That is to say: `x<<42`equivalent to `x<<10`, `x>>42`equivalent to `x>>10`, `x >>>42`equivalent to `x >>> 10`.