package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ViewNext: ImageVector
    get() {
        val current = _viewNext
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ViewNext",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="20.587 22.0 15.0 16.41 15.0 7.0 16.998 7.0 16.998 15.582 22.0 20.587 20.587 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.587 22
                moveTo(x = 20.587f, y = 22.0f)
                // L 15 16.41
                lineTo(x = 15.0f, y = 16.41f)
                // L 15 7
                lineTo(x = 15.0f, y = 7.0f)
                // L 16.998 7
                lineTo(x = 16.998f, y = 7.0f)
                // L 16.998 15.582
                lineTo(x = 16.998f, y = 15.582f)
                // L 22 20.587
                lineTo(x = 22.0f, y = 20.587f)
                // L 20.587 22z
                lineTo(x = 20.587f, y = 22.0f)
                close()
            }
            // M16 2 a14 14 0 0 1 10 4.23 V2 h2 v8 h-8 V8 h4.92 A11.98 11.98 0 1 0 28 16 h2 A14 14 0 1 1 16 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 0 1 10 4.23
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 4.23f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4.92
                horizontalLineToRelative(dx = 4.92f)
                // A 11.98 11.98 0 1 0 28 16
                arcTo(
                    horizontalEllipseRadius = 11.98f,
                    verticalEllipseRadius = 11.98f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 16.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // A 14 14 0 1 1 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 2.0f,
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
        }.build().also { _viewNext = it }
    }

@Suppress("ObjectPropertyName")
private var _viewNext: ImageVector? = null
