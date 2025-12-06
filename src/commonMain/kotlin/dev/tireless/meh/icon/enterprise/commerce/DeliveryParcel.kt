package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeliveryParcel: ImageVector
    get() {
        val current = _deliveryParcel
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DeliveryParcel",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.48 8.62 -10 -5.5 a1 1 0 0 0 -.96 0 l-10 5.5 a1 1 0 0 0 0 1.76 L18 15.59 v10.72 l-3.04 -1.67 L14 26.39 l4.52 2.49 a1 1 0 0 0 .96 0 l10 -5.5 A1 1 0 0 0 30 22.5 v-13 a1 1 0 0 0 -.52 -.88 M19 5.14 l7.92 4.36 L19 13.86 11.08 9.5Z m9 16.77 -8 4.4 V15.59 l8 -4.4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.48 8.62
                moveTo(x = 29.48f, y = 8.62f)
                // l -10 -5.5
                lineToRelative(dx = -10.0f, dy = -5.5f)
                // a 1 1 0 0 0 -0.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.0f,
                )
                // l -10 5.5
                lineToRelative(dx = -10.0f, dy = 5.5f)
                // a 1 1 0 0 0 0 1.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.76f,
                )
                // L 18 15.59
                lineTo(x = 18.0f, y = 15.59f)
                // v 10.72
                verticalLineToRelative(dy = 10.72f)
                // l -3.04 -1.67
                lineToRelative(dx = -3.04f, dy = -1.67f)
                // L 14 26.39
                lineTo(x = 14.0f, y = 26.39f)
                // l 4.52 2.49
                lineToRelative(dx = 4.52f, dy = 2.49f)
                // a 1 1 0 0 0 0.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.96f,
                    dy1 = 0.0f,
                )
                // l 10 -5.5
                lineToRelative(dx = 10.0f, dy = -5.5f)
                // A 1 1 0 0 0 30 22.5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 22.5f,
                )
                // v -13
                verticalLineToRelative(dy = -13.0f)
                // a 1 1 0 0 0 -0.52 -0.88
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.52f,
                    dy1 = -0.88f,
                )
                // M 19 5.14
                moveTo(x = 19.0f, y = 5.14f)
                // l 7.92 4.36
                lineToRelative(dx = 7.92f, dy = 4.36f)
                // L 19 13.86
                lineTo(x = 19.0f, y = 13.86f)
                // L 11.08 9.5z
                lineTo(x = 11.08f, y = 9.5f)
                close()
                // m 9 16.77
                moveToRelative(dx = 9.0f, dy = 16.77f)
                // l -8 4.4
                lineToRelative(dx = -8.0f, dy = 4.4f)
                // V 15.59
                verticalLineTo(y = 15.59f)
                // l 8 -4.4z
                lineToRelative(dx = 8.0f, dy = -4.4f)
                close()
            }
            // <rect width="8" height="2" x="2.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // l -8 0
                lineToRelative(dx = -8.0f, dy = 0.0f)
                // l 0 -2
                lineToRelative(dx = 0.0f, dy = -2.0f)
                // l 8 -0z
                lineToRelative(dx = 8.0f, dy = -0.0f)
                close()
            }
            // <rect width="8" height="2" x="4.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 24
                moveTo(x = 12.0f, y = 24.0f)
                // l -8 0
                lineToRelative(dx = -8.0f, dy = 0.0f)
                // l 0 -2
                lineToRelative(dx = 0.0f, dy = -2.0f)
                // l 8 -0z
                lineToRelative(dx = 8.0f, dy = -0.0f)
                close()
            }
            // <rect width="8" height="2" x="6.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // l -8 0
                lineToRelative(dx = -8.0f, dy = 0.0f)
                // l 0 -2
                lineToRelative(dx = 0.0f, dy = -2.0f)
                // l 8 -0z
                lineToRelative(dx = 8.0f, dy = -0.0f)
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
        }.build().also { _deliveryParcel = it }
    }

@Suppress("ObjectPropertyName")
private var _deliveryParcel: ImageVector? = null
