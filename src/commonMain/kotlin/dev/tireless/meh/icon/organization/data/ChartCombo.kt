package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartCombo: ImageVector
    get() {
        val current = _chartCombo
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartCombo",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 28 V16 h-8 v12 h-4 V12 H7 v16 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m-14 0 H9 V14 h4Z m12 0 h-4 V18 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 28
                moveTo(x = 27.0f, y = 28.0f)
                // V 16
                verticalLineTo(y = 16.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // V 14
                verticalLineTo(y = 14.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 12 0
                moveToRelative(dx = 12.0f, dy = 0.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // M22.79 14 a2 2 0 0 1 -1.18 -.39 L11.2 6 8.23 10 l-1.6 -1.2 2.98 -4 a2 2 0 0 1 2.75 -.44 L22.79 12 l3.6 -4.86 L28 8.34 l-3.6 4.85 A2 2 0 0 1 22.79 14
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.79 14
                moveTo(x = 22.79f, y = 14.0f)
                // a 2 2 0 0 1 -1.18 -0.39
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.18f,
                    dy1 = -0.39f,
                )
                // L 11.2 6
                lineTo(x = 11.2f, y = 6.0f)
                // L 8.23 10
                lineTo(x = 8.23f, y = 10.0f)
                // l -1.6 -1.2
                lineToRelative(dx = -1.6f, dy = -1.2f)
                // l 2.98 -4
                lineToRelative(dx = 2.98f, dy = -4.0f)
                // a 2 2 0 0 1 2.75 -0.44
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.75f,
                    dy1 = -0.44f,
                )
                // L 22.79 12
                lineTo(x = 22.79f, y = 12.0f)
                // l 3.6 -4.86
                lineToRelative(dx = 3.6f, dy = -4.86f)
                // L 28 8.34
                lineTo(x = 28.0f, y = 8.34f)
                // l -3.6 4.85
                lineToRelative(dx = -3.6f, dy = 4.85f)
                // A 2 2 0 0 1 22.79 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.79f,
                    y1 = 14.0f,
                )
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
        }.build().also { _chartCombo = it }
    }

@Suppress("ObjectPropertyName")
private var _chartCombo: ImageVector? = null
