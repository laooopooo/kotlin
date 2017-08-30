// INSPECTION_CLASS: org.jetbrains.kotlin.android.inspection.TypeParameterFindViewByIdInspection

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

@Suppress(
        "TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER",
        "UNUSED_VARIABLE"
)
class OtherActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val tvHello = <weak_warning descr="Can be converted to findViewById<TextView>(...)">findViewById(R.id.tvHello) as TextView</weak_warning>
        val btnGo = <weak_warning descr="Can be converted to findViewById<Button>(...)">findViewById(R.id.btnGo) as Button?</weak_warning>

        // shoul be ok, already has type parameter
        val tvHello2 = findViewById<TextView>(R.id.tvHello) as TextView
    }
}

class R {
    object layout {
        val activity_other = 100500
    }

    object id {
        val tvHello = 0
        val btnGo = 1
    }
}