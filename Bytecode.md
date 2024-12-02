In Java, ==the code that the JVM can understand== is called bytecode

![[Pasted image 20241220101226.png]]

Một chương trình sau khi được viết bằng ngôn ngữ Java (có phần mở rộng là .java) phải được biên dịch thành tập tin thực thi được trên máy ảo Java (có phần mở rộng là .class).  Tập tin thực thi này chứa các chỉ thị dưới dạng mã Bytecode mà máy ảo Java hiểu được phải làm gì.

- Thông dịch (Interpreter) : Nó dịch từng lệnh rồi chạy từng lệnh, lần sau muốn chạy lại thì phải dịch lại.
- Biên dịch (Compiler): Code sau khi được biên dịch sẽ tạo ra 1 file thường là .exe, và file .exe này có thể đem sử dụng lại không cần biên dịch nữa.

Some methods and code blocks need to be called frequently (the so-called hot code), so **the JIT (Just in Time Compilation)** compiler was introduced later, and JIT belongs to runtime compilation. When the JIT compiler completes the first compilation, it will save the machine code corresponding to the bytecode, which can be used directly next time.
