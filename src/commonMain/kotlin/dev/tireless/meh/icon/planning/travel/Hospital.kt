package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hospital: ImageVector
    get() {
        val current = _hospital
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Hospital",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="21.0 10.0 17.0 10.0 17.0 6.0 15.0 6.0 15.0 10.0 11.0 10.0 11.0 12.0 15.0 12.0 15.0 16.0 17.0 16.0 17.0 12.0 21.0 12.0 21.0 10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 10
                moveTo(x = 21.0f, y = 10.0f)
                // L 17 10
                lineTo(x = 17.0f, y = 10.0f)
                // L 17 6
                lineTo(x = 17.0f, y = 6.0f)
                // L 15 6
                lineTo(x = 15.0f, y = 6.0f)
                // L 15 10
                lineTo(x = 15.0f, y = 10.0f)
                // L 11 10
                lineTo(x = 11.0f, y = 10.0f)
                // L 11 12
                lineTo(x = 11.0f, y = 12.0f)
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
                // L 15 16
                lineTo(x = 15.0f, y = 16.0f)
                // L 17 16
                lineTo(x = 17.0f, y = 16.0f)
                // L 17 12
                lineTo(x = 17.0f, y = 12.0f)
                // L 21 12
                lineTo(x = 21.0f, y = 12.0f)
                // L 21 10z
                lineTo(x = 21.0f, y = 10.0f)
                close()
            }
            // M28 10 h-2 V4 a2 2 0 0 0 -2 -2 H8 a2 2 0 0 0 -2 2 v6 H4 a2 2 0 0 0 -2 2 v18 h28 V12 a2 2 0 0 0 -2 -2 M14 28 v-6 h4 v6Z m6 0 v-7 a1 1 0 0 0 -1 -1 h-6 a1 1 0 0 0 -1 1 v7 H4 V12 h4 V4 h16 v8 h4 v16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 10
                moveTo(x = 28.0f, y = 10.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // V 12
                verticalLineTo(y = 12.0f)
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
                // M 14 28
                moveTo(x = 14.0f, y = 28.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 16z
                verticalLineToRelative(dy = 16.0f)
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
        }.build().also { _hospital = it }
    }

@Suppress("ObjectPropertyName")
private var _hospital: ImageVector? = null
