public class SimplifiedStrBuilderTest {
    public static void main(String[] args) {
        // 测试 1: 基本追加
        SimplifiedStrBuilder sb1 = new SimplifiedStrBuilder();
        sb1.append("Hello").append(" ").append("World!");
        System.out.println("测试 1 结果: " + sb1.toString());
        System.out.println("预期: Hello World!");
        System.out.println();

        // 测试 2: 处理 null
        SimplifiedStrBuilder sb2 = new SimplifiedStrBuilder();
        sb2.append("Value: ").append(null);
        System.out.println("测试 2 结果: " + sb2.toString());
        System.out.println("预期: Value: null");
        System.out.println();

        // 测试 3: 使用字符串构造函数
        SimplifiedStrBuilder sb3 = new SimplifiedStrBuilder("Initial");
        sb3.append(" content");
        System.out.println("测试 3 结果: " + sb3.toString());
        System.out.println("预期: Initial content");
        System.out.println();

        // 测试 4: 容量扩展
        SimplifiedStrBuilder sb4 = new SimplifiedStrBuilder(5);
        System.out.println("测试 4 初始容量: " + sb4.capacity());
        sb4.append("1234567890");
        System.out.println("测试 4 追加后容量: " + sb4.capacity());
        System.out.println("测试 4 结果: " + sb4.toString());
        System.out.println("预期: 1234567890");
    }
}
