package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TaskSettings: ImageVector
    get() {
        val current = _taskSettings
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TaskSettings",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 24 v-2 h-2.1 a5 5 0 0 0 -.73 -1.75 l1.49 -1.5 -1.42 -1.4 -1.49 1.48 A5 5 0 0 0 24 18.1 V16 h-2 v2.1 a5 5 0 0 0 -1.75 .73 l-1.5 -1.49 -1.4 1.42 1.48 1.49 A5 5 0 0 0 18.1 22 H16 v2 h2.1 a5 5 0 0 0 .73 1.75 l-1.49 1.5 1.42 1.4 1.49 -1.48 A5 5 0 0 0 22 27.9 V30 h2 v-2.1 a5 5 0 0 0 1.75 -.73 l1.5 1.49 1.4 -1.42 -1.48 -1.49 A5 5 0 0 0 27.9 24Z m-7 2 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 24
                moveTo(x = 30.0f, y = 24.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2.1
                horizontalLineToRelative(dx = -2.1f)
                // a 5 5 0 0 0 -0.73 -1.75
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.73f,
                    dy1 = -1.75f,
                )
                // l 1.49 -1.5
                lineToRelative(dx = 1.49f, dy = -1.5f)
                // l -1.42 -1.4
                lineToRelative(dx = -1.42f, dy = -1.4f)
                // l -1.49 1.48
                lineToRelative(dx = -1.49f, dy = 1.48f)
                // A 5 5 0 0 0 24 18.1
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 18.1f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // a 5 5 0 0 0 -1.75 0.73
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.75f,
                    dy1 = 0.73f,
                )
                // l -1.5 -1.49
                lineToRelative(dx = -1.5f, dy = -1.49f)
                // l -1.4 1.42
                lineToRelative(dx = -1.4f, dy = 1.42f)
                // l 1.48 1.49
                lineToRelative(dx = 1.48f, dy = 1.49f)
                // A 5 5 0 0 0 18.1 22
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.1f,
                    y1 = 22.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.1
                horizontalLineToRelative(dx = 2.1f)
                // a 5 5 0 0 0 0.73 1.75
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = 1.75f,
                )
                // l -1.49 1.5
                lineToRelative(dx = -1.49f, dy = 1.5f)
                // l 1.42 1.4
                lineToRelative(dx = 1.42f, dy = 1.4f)
                // l 1.49 -1.48
                lineToRelative(dx = 1.49f, dy = -1.48f)
                // A 5 5 0 0 0 22 27.9
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 27.9f,
                )
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.1
                verticalLineToRelative(dy = -2.1f)
                // a 5 5 0 0 0 1.75 -0.73
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.75f,
                    dy1 = -0.73f,
                )
                // l 1.5 1.49
                lineToRelative(dx = 1.5f, dy = 1.49f)
                // l 1.4 -1.42
                lineToRelative(dx = 1.4f, dy = -1.42f)
                // l -1.48 -1.49
                lineToRelative(dx = -1.48f, dy = -1.49f)
                // A 5 5 0 0 0 27.9 24z
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.9f,
                    y1 = 24.0f,
                )
                close()
                // m -7 2
                moveToRelative(dx = -7.0f, dy = 2.0f)
                // a 3 3 0 1 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
            }
            // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h7 v-2 H7 V7 h3 v3 h12 V7 h3 v6 h2 V7 a2 2 0 0 0 -2 -2 m-5 3 h-8 V4 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 5
                moveTo(x = 25.0f, y = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 21
                verticalLineToRelative(dy = 21.0f)
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
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // m -5 3
                moveToRelative(dx = -5.0f, dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _taskSettings = it }
    }

@Suppress("ObjectPropertyName")
private var _taskSettings: ImageVector? = null
