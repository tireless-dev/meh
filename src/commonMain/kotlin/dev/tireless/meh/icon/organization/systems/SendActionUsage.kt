package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendActionUsage: ImageVector
    get() {
        val current = _sendActionUsage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SendActionUsage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M9 21 a1 1 0 0 1 -1 -1 v-8 a1 1 0 0 1 1 -1 h11.17 a2 2 0 0 1 1.42 .59 L26 16 l-4.41 4.41 A2 2 0 0 1 20.17 21z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // h 11.17
                horizontalLineToRelative(dx = 11.17f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // L 26 16
                lineTo(x = 26.0f, y = 16.0f)
                // l -4.41 4.41
                lineToRelative(dx = -4.41f, dy = 4.41f)
                // A 2 2 0 0 1 20.17 21z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.17f,
                    y1 = 21.0f,
                )
                close()
            }
            // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 30
                moveTo(x = 21.0f, y = 30.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -4.96 0 -9 -4.04 -9 -9
                curveToRelative(
                    dx1 = -4.96f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = -4.04f,
                    dx3 = -9.0f,
                    dy3 = -9.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -4.96 4.04 -9 9 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.96f,
                    dx2 = 4.04f,
                    dy2 = -9.0f,
                    dx3 = 9.0f,
                    dy3 = -9.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 4.96 0 9 4.04 9 9
                curveToRelative(
                    dx1 = 4.96f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = 4.04f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 4.96 -4.04 9 -9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.96f,
                    dx2 = -4.04f,
                    dy2 = 9.0f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 7 7 0 0 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // a 7 7 0 0 0 -7 -7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _sendActionUsage = it }
    }

@Suppress("ObjectPropertyName")
private var _sendActionUsage: ImageVector? = null
