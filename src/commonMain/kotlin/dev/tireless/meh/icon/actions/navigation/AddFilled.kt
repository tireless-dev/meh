package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddFilled: ImageVector
    get() {
        val current = _addFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AddFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 A14.17 14.17 0 0 0 2 16 a14.17 14.17 0 0 0 14 14 14.17 14.17 0 0 0 14 -14 A14.17 14.17 0 0 0 16 2 m8 15 h-7 v7 h-2 v-7 H8 v-2 h7 V8 h2 v7 h7Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // A 14.17 14.17 0 0 0 2 16
                arcTo(
                    horizontalEllipseRadius = 14.17f,
                    verticalEllipseRadius = 14.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // a 14.17 14.17 0 0 0 14 14
                arcToRelative(
                    a = 14.17f,
                    b = 14.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // a 14.17 14.17 0 0 0 14 -14
                arcToRelative(
                    a = 14.17f,
                    b = 14.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = -14.0f,
                )
                // A 14.17 14.17 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.17f,
                    verticalEllipseRadius = 14.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 8 15
                moveToRelative(dx = 8.0f, dy = 15.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
            }
            // <polygon points="24.0 17.0 17.0 17.0 17.0 24.0 15.0 24.0 15.0 17.0 8.0 17.0 8.0 15.0 15.0 15.0 15.0 8.0 17.0 8.0 17.0 15.0 24.0 15.0 24.0 17.0" fill="none" fill-opacity="0.0" style="fill:#fff;fill-opacity:0" />
            path(
                fillAlpha = 0.0f,
            ) {
                // M 24 17
                moveTo(x = 24.0f, y = 17.0f)
                // L 17 17
                lineTo(x = 17.0f, y = 17.0f)
                // L 17 24
                lineTo(x = 17.0f, y = 24.0f)
                // L 15 24
                lineTo(x = 15.0f, y = 24.0f)
                // L 15 17
                lineTo(x = 15.0f, y = 17.0f)
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // L 8 15
                lineTo(x = 8.0f, y = 15.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // L 17 15
                lineTo(x = 17.0f, y = 15.0f)
                // L 24 15
                lineTo(x = 24.0f, y = 15.0f)
                // L 24 17z
                lineTo(x = 24.0f, y = 17.0f)
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
        }.build().also { _addFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _addFilled: ImageVector? = null
