package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartColumnTarget: ImageVector
    get() {
        val current = _chartColumnTarget
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartColumnTarget",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 28 V6 h-8 v22 h-4 V14 H7 v14 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m-14 0 H9 V16 h4Z m12 0 h-4 V8 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 28
                moveTo(x = 27.0f, y = 28.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 14
                verticalLineTo(y = 14.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -14 0
                moveToRelative(dx = -14.0f, dy = 0.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 16
                verticalLineTo(y = 16.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 12 0
                moveToRelative(dx = 12.0f, dy = 0.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // <rect width="8" height="2" x="19.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="8" height="2" x="7.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 10
                moveTo(x = 7.0f, y = 10.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _chartColumnTarget = it }
    }

@Suppress("ObjectPropertyName")
private var _chartColumnTarget: ImageVector? = null
