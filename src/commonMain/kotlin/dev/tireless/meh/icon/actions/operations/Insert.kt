package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Insert: ImageVector
    get() {
        val current = _insert
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Insert",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M2 9 h9 V2 H2Z m2 -5 h5 v3 H4Z M2 19 h9 v-7 H2Z m2 -5 h5 v3 H4Z M2 29 h9 v-7 H2Z m2 -5 h5 v3 H4Z M27 9 h-9 l3.41 -3.59 L20 4 l-6 6 6 6 1.41 -1.41 L18 11 h9 a1 1 0 0 1 1 1 v12 a1 1 0 0 1 -1 1 H15 v2 h12 a3 3 0 0 0 3 -3 V12 a3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
                // m 2 -5
                moveToRelative(dx = 2.0f, dy = -5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
                // m 2 -5
                moveToRelative(dx = 2.0f, dy = -5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // M 2 29
                moveTo(x = 2.0f, y = 29.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
                // m 2 -5
                moveToRelative(dx = 2.0f, dy = -5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // M 27 9
                moveTo(x = 27.0f, y = 9.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // l 3.41 -3.59
                lineToRelative(dx = 3.41f, dy = -3.59f)
                // L 20 4
                lineTo(x = 20.0f, y = 4.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 18 11
                lineTo(x = 18.0f, y = 11.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
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
        }.build().also { _insert = it }
    }

@Suppress("ObjectPropertyName")
private var _insert: ImageVector? = null
