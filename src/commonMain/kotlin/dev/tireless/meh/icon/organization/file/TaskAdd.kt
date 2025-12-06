package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TaskAdd: ImageVector
    get() {
        val current = _taskAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TaskAdd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="31.0 24.0 27.0 24.0 27.0 20.0 25.0 20.0 25.0 24.0 21.0 24.0 21.0 26.0 25.0 26.0 25.0 30.0 27.0 30.0 27.0 26.0 31.0 26.0 31.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 24
                moveTo(x = 31.0f, y = 24.0f)
                // L 27 24
                lineTo(x = 27.0f, y = 24.0f)
                // L 27 20
                lineTo(x = 27.0f, y = 20.0f)
                // L 25 20
                lineTo(x = 25.0f, y = 20.0f)
                // L 25 24
                lineTo(x = 25.0f, y = 24.0f)
                // L 21 24
                lineTo(x = 21.0f, y = 24.0f)
                // L 21 26
                lineTo(x = 21.0f, y = 26.0f)
                // L 25 26
                lineTo(x = 25.0f, y = 26.0f)
                // L 25 30
                lineTo(x = 25.0f, y = 30.0f)
                // L 27 30
                lineTo(x = 27.0f, y = 30.0f)
                // L 27 26
                lineTo(x = 27.0f, y = 26.0f)
                // L 31 26
                lineTo(x = 31.0f, y = 26.0f)
                // L 31 24z
                lineTo(x = 31.0f, y = 24.0f)
                close()
            }
            // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h10 v-2 H7 V7 h3 v3 h12 V7 h3 v9 h2 V7 a2 2 0 0 0 -2 -2 m-5 3 h-8 V4 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 5
                moveTo(x = 25.0f, y = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // m -5 3
                moveToRelative(dx = -5.0f, dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _taskAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _taskAdd: ImageVector? = null
