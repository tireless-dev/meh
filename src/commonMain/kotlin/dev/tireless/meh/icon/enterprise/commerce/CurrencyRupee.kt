package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyRupee: ImageVector
    get() {
        val current = _currencyRupee
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CurrencyRupee",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 7 V5 H8 v2 h5.5 a4.5 4.5 0 0 1 4.45 4 H8 v2 h9.95 a4.5 4.5 0 0 1 -4.45 4 H8 v2.35 L17.62 28 l1.33 -1.49 L10.61 19 h2.89 a6.5 6.5 0 0 0 6.47 -6 H24 v-2 h-4.03 a6.5 6.5 0 0 0 -1.79 -4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 7
                moveTo(x = 24.0f, y = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5.5
                horizontalLineToRelative(dx = 5.5f)
                // a 4.5 4.5 0 0 1 4.45 4
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.45f,
                    dy1 = 4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 9.95
                horizontalLineToRelative(dx = 9.95f)
                // a 4.5 4.5 0 0 1 -4.45 4
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.45f,
                    dy1 = 4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2.35
                verticalLineToRelative(dy = 2.35f)
                // L 17.62 28
                lineTo(x = 17.62f, y = 28.0f)
                // l 1.33 -1.49
                lineToRelative(dx = 1.33f, dy = -1.49f)
                // L 10.61 19
                lineTo(x = 10.61f, y = 19.0f)
                // h 2.89
                horizontalLineToRelative(dx = 2.89f)
                // a 6.5 6.5 0 0 0 6.47 -6
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.47f,
                    dy1 = -6.0f,
                )
                // H 24
                horizontalLineTo(x = 24.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4.03
                horizontalLineToRelative(dx = -4.03f)
                // a 6.5 6.5 0 0 0 -1.79 -4z
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.79f,
                    dy1 = -4.0f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _currencyRupee = it }
    }

@Suppress("ObjectPropertyName")
private var _currencyRupee: ImageVector? = null
