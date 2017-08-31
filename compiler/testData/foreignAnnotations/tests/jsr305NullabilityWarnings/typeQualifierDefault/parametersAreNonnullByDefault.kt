// !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER
// JSR305_GLOBAL_REPORT warn

// FILE: A.java

import javax.annotation.*;

@ParametersAreNonnullByDefault
public class A {
    public String foo(String q, @Nonnull String x, @CheckForNull CharSequence y) {
        return "";
    }
}

// FILE: main.kt

fun main(a: A) {
    // foo is platform
    a.foo(<!NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS!>null<!>, <!NULL_FOR_NONNULL_TYPE!>null<!>, "").length
}
