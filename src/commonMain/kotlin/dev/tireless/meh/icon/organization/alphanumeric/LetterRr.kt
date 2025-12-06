package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterRr: ImageVector
    get() {
        val current = _letterRr
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LetterRr",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 15 v-4 a2 2 0 0 0 -2 -2 H8 v14 h2 v-6 h1.48 l2.34 6 H16 l-2.33 -6 H14 a2 2 0 0 0 2 -2 m-6 -4 h4 v4 h-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 1.48
                horizontalLineToRelative(dx = 1.48f)
                // l 2.34 6
                lineToRelative(dx = 2.34f, dy = 6.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // l -2.33 -6
                lineToRelative(dx = -2.33f, dy = -6.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
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
                // m -6 -4
                moveToRelative(dx = -6.0f, dy = -4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="24.0 13.0 18.0 13.0 18.0 23.0 20.0 23.0 20.0 15.0 24.0 15.0 24.0 13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 13
                moveTo(x = 24.0f, y = 13.0f)
                // L 18 13
                lineTo(x = 18.0f, y = 13.0f)
                // L 18 23
                lineTo(x = 18.0f, y = 23.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 20 15
                lineTo(x = 20.0f, y = 15.0f)
                // L 24 15
                lineTo(x = 24.0f, y = 15.0f)
                // L 24 13z
                lineTo(x = 24.0f, y = 13.0f)
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
        }.build().also { _letterRr = it }
    }

@Suppress("ObjectPropertyName")
private var _letterRr: ImageVector? = null
