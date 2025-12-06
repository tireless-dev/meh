package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsExplorer: ImageVector
    get() {
        val current = _cicsExplorer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CicsExplorer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="24.0 16.0 19.4 14.6 21.7 10.3 17.4 12.6 16.0 8.0 14.6 12.6 10.3 10.3 12.6 14.6 8.0 16.0 12.6 17.4 10.3 21.7 14.6 19.4 16.0 24.0 17.4 19.4 21.7 21.7 19.4 17.4 24.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 16
                moveTo(x = 24.0f, y = 16.0f)
                // L 19.4 14.6
                lineTo(x = 19.4f, y = 14.6f)
                // L 21.7 10.3
                lineTo(x = 21.7f, y = 10.3f)
                // L 17.4 12.6
                lineTo(x = 17.4f, y = 12.6f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // L 14.6 12.6
                lineTo(x = 14.6f, y = 12.6f)
                // L 10.3 10.3
                lineTo(x = 10.3f, y = 10.3f)
                // L 12.6 14.6
                lineTo(x = 12.6f, y = 14.6f)
                // L 8 16
                lineTo(x = 8.0f, y = 16.0f)
                // L 12.6 17.4
                lineTo(x = 12.6f, y = 17.4f)
                // L 10.3 21.7
                lineTo(x = 10.3f, y = 21.7f)
                // L 14.6 19.4
                lineTo(x = 14.6f, y = 19.4f)
                // L 16 24
                lineTo(x = 16.0f, y = 24.0f)
                // L 17.4 19.4
                lineTo(x = 17.4f, y = 19.4f)
                // L 21.7 21.7
                lineTo(x = 21.7f, y = 21.7f)
                // L 19.4 17.4
                lineTo(x = 19.4f, y = 17.4f)
                // L 24 16z
                lineTo(x = 24.0f, y = 16.0f)
                close()
            }
            // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 14 14 0 1 1 14 -14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = -14.0f,
                )
                // a 14 14 0 0 1 -14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 14.0f,
                )
                // m 0 -26
                moveToRelative(dx = 0.0f, dy = -26.0f)
                // a 12 12 0 1 0 12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
                // A 12 12 0 0 0 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
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
        }.build().also { _cicsExplorer = it }
    }

@Suppress("ObjectPropertyName")
private var _cicsExplorer: ImageVector? = null
