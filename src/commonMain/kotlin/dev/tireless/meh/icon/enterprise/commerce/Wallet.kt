package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wallet: ImageVector
    get() {
        val current = _wallet
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Wallet",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
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
            // <rect width="2" height="2" x="22.0" y="17.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 17
                moveTo(x = 22.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M28 8 H4 V5 h22 V3 H4 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 M4 26 V10 h24 v3 h-8 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 v3Z m24 -11 v6 h-8 v-6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // M 4 26
                moveTo(x = 4.0f, y = 26.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
                // m 24 -11
                moveToRelative(dx = 24.0f, dy = -11.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
            }
        }.build().also { _wallet = it }
    }

@Suppress("ObjectPropertyName")
private var _wallet: ImageVector? = null
