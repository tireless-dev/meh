package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Reply: ImageVector
    get() {
        val current = _reply
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Reply",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28.88 30 A1 1 0 0 1 28 29.5 15.2 15.2 0 0 0 15 22 v6 a1 1 0 0 1 -.62 .92 1 1 0 0 1 -1.09 -.21 l-12 -12 a1 1 0 0 1 0 -1.42 l12 -12 a1 1 0 0 1 1.09 -.21 A1 1 0 0 1 15 4 v6.11 a17.2 17.2 0 0 1 15 17 16 16 0 0 1 -.13 2 1 1 0 0 1 -.79 .86Z M14.5 20 A17.6 17.6 0 0 1 28 26 a15.3 15.3 0 0 0 -14.09 -14 A1 1 0 0 1 13 11 V6.41 L3.41 16 13 25.59 V21 a1 1 0 0 1 1 -1 h.54Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.88 30
                moveTo(x = 28.88f, y = 30.0f)
                // A 1 1 0 0 1 28 29.5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 29.5f,
                )
                // A 15.2 15.2 0 0 0 15 22
                arcTo(
                    horizontalEllipseRadius = 15.2f,
                    verticalEllipseRadius = 15.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 22.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 1 -0.62 0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.62f,
                    dy1 = 0.92f,
                )
                // a 1 1 0 0 1 -1.09 -0.21
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.09f,
                    dy1 = -0.21f,
                )
                // l -12 -12
                lineToRelative(dx = -12.0f, dy = -12.0f)
                // a 1 1 0 0 1 0 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.42f,
                )
                // l 12 -12
                lineToRelative(dx = 12.0f, dy = -12.0f)
                // a 1 1 0 0 1 1.09 -0.21
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.09f,
                    dy1 = -0.21f,
                )
                // A 1 1 0 0 1 15 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 4.0f,
                )
                // v 6.11
                verticalLineToRelative(dy = 6.11f)
                // a 17.2 17.2 0 0 1 15 17
                arcToRelative(
                    a = 17.2f,
                    b = 17.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 15.0f,
                    dy1 = 17.0f,
                )
                // a 16 16 0 0 1 -0.13 2
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.13f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 1 -0.79 0.86z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.79f,
                    dy1 = 0.86f,
                )
                close()
                // M 14.5 20
                moveTo(x = 14.5f, y = 20.0f)
                // A 17.6 17.6 0 0 1 28 26
                arcTo(
                    horizontalEllipseRadius = 17.6f,
                    verticalEllipseRadius = 17.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 26.0f,
                )
                // a 15.3 15.3 0 0 0 -14.09 -14
                arcToRelative(
                    a = 15.3f,
                    b = 15.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -14.09f,
                    dy1 = -14.0f,
                )
                // A 1 1 0 0 1 13 11
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 11.0f,
                )
                // V 6.41
                verticalLineTo(y = 6.41f)
                // L 3.41 16
                lineTo(x = 3.41f, y = 16.0f)
                // L 13 25.59
                lineTo(x = 13.0f, y = 25.59f)
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 0.54z
                horizontalLineToRelative(dx = 0.54f)
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
        }.build().also { _reply = it }
    }

@Suppress("ObjectPropertyName")
private var _reply: ImageVector? = null
